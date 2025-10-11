package net.peakresponse.android.shared.dao

import android.util.Log
import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import net.peakresponse.android.shared.dao.fixtures.Fixtures
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException
import java.lang.Exception

@RunWith(AndroidJUnit4::class)
class IncidentDaoTest {
    companion object {
        private const val TAG = "net.peakresponse.android.shared.dao.IncidentDaoTest"
    }

    private lateinit var db: PRAppDatabase
    private lateinit var dao: IncidentDao

    @Before
    fun createDb() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        db = Room.inMemoryDatabaseBuilder(context, PRAppDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        runBlocking {
            Fixtures.populate(db)
        }
        dao = db.getIncidentDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun getIncidents() {
        val incidentsFlow = dao.getIncidents()
        runBlocking {
            val incidents = incidentsFlow.first()
            Assert.assertEquals(3, incidents.size)
        }
    }

    @Test
    @Throws(Exception::class)
    fun getIncidentsWithScenes() {
        val incidentsFlow = dao.getIncidentsWithScenes()
        runBlocking {
            val incidents = incidentsFlow.first()
            Assert.assertEquals(3, incidents.size)
        }
    }

    @Test
    @Throws(Exception::class)
    fun getActiveMciIncidentsWithScenes() {
        val incidentsFlow = dao.getActiveMciIncidentsWithScenes()
        runBlocking {
            val incidents = incidentsFlow.first()
            Assert.assertEquals(1, incidents.size)
            Assert.assertEquals(
                "99 Grove St\nSan Francisco, CA 94102",
                incidents[0].sceneWithAddress?.address
            )
        }
    }
}
