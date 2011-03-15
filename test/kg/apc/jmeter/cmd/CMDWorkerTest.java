package kg.apc.jmeter.cmd;

import java.io.File;
import java.io.IOException;
import kg.apc.emulators.TestJMeterUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author undera
 */
public class CMDWorkerTest {

    public CMDWorkerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addExportMode method, of class CMDWorker.
     */
    @Test
    public void testAddExportMode() {
        System.out.println("addExportMode");
        int mode = 0;
        CMDWorker instance = new CMDWorker();
        instance.addExportMode(mode);
    }

    /**
     * Test of setInputFile method, of class CMDWorker.
     */
    @Test
    public void testSetInputFile() {
        System.out.println("setInputFile");
        String string = "";
        CMDWorker instance = new CMDWorker();
        instance.setInputFile(string);
    }

    /**
     * Test of setOutputCSVFile method, of class CMDWorker.
     */
    @Test
    public void testSetOutputCSVFile() {
        System.out.println("setOutputCSVFile");
        String string = "";
        CMDWorker instance = new CMDWorker();
        instance.setOutputCSVFile(string);
    }

    /**
     * Test of setOutputPNGFile method, of class CMDWorker.
     */
    @Test
    public void testSetOutputPNGFile() {
        System.out.println("setOutputPNGFile");
        String string = "";
        CMDWorker instance = new CMDWorker();
        instance.setOutputPNGFile(string);
    }

    /**
     * Test of setPluginType method, of class CMDWorker.
     */
    @Test
    public void testSetPluginType() {
        System.out.println("setPluginType");
        String string = "";
        CMDWorker instance = new CMDWorker();
        instance.setPluginType(string);
    }

    /**
     * Test of doJob method, of class CMDWorker.
     */
    @Test
    public void testDoJob() throws IOException {
        System.out.println("doJob");
        CMDWorker instance = new CMDWorker();
        instance.setInputFile("/home/undera/short.jtl");
        instance.setOutputPNGFile(File.createTempFile("test", ".png").getAbsolutePath());
        instance.setOutputCSVFile(File.createTempFile("test", ".csv").getAbsolutePath());
        instance.setPluginType("ResponseTimesDistribution");
        instance.addExportMode(CMDWorker.EXPORT_PNG);
        instance.addExportMode(CMDWorker.EXPORT_CSV);
        int result = instance.doJob();
        int expResult = 0;
        assertEquals(expResult, result);
    }

}