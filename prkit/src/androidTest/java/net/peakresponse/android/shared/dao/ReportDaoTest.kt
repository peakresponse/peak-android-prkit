package net.peakresponse.android.shared.dao

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
class ReportDaoTest {
    companion object {
        private const val TAG = "net.peakresponse.android.shared.dao.ReportDaoTest"
    }

    private lateinit var db: PRAppDatabase
    private lateinit var dao: ReportDao

    @Before
    fun createDb() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        db = Room.inMemoryDatabaseBuilder(context, PRAppDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        runBlocking {
            Fixtures.populate(db)
        }
        dao = db.getReportDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun getReportsWithPatients() {
        val reportsFlow = dao.getReportsWithPatients("63171e45-2188-411b-8fd6-203d7f2134cf")
        runBlocking {
            val reportsWithPatients = reportsFlow.first()
            Assert.assertEquals(3, reportsWithPatients.size)
        }
    }
}
