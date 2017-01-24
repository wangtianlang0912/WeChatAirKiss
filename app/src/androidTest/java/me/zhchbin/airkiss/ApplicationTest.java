package me.zhchbin.airkiss;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.util.Log;

import java.util.Random;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);


    }
//    AirKissEncoder encoder =new AirKissEncoder();
//
//    public void testByte() throws Exception{
//
//        int crc8 = encoder.CRC8("abstest");
//
//        assertEquals(crc8,0);
//
//    }
//
//
//
//                                                /////  [1,2,3,4]    50次
//
//    public void testMagicCode() throws Exception {
//        encoder.magicCode("abctest","12345671");
//        int data[] = encoder.getEncodedData();
//
//        Log.i("ApplicationTest",data[0]+"");     //[1,16,42,59]     20次
//        assertEquals(0,0);
//    }
//
//
//    public void testPrefixCode() throws Exception {
//        encoder.prefixCode("12345671");
//        int data[] = encoder.getEncodedData();
//
//        Log.i("ApplicationTest",data[0]+""); //[64,88,108,114]      15次
//        assertEquals(0,0);
//    }
//
//    public void testSequenceCode() throws Exception {
//        encoder.sequenceCode("abctest","12345671");
//        int data[] = encoder.getEncodedData();
//
//        Log.i("ApplicationTest",data[0]+"");//[241,128,305,306      15次
//
//        // ,307,308,168,129,309,310,311,305    ,205,130,360   ,353,354,355,130,131,372,357,371,372]
//        assertEquals(0,0);
//    }
//

    public void testRandomChar() throws Exception {

        char mRandomChar =(char)(new Random().nextInt(0x7F));
        char c = (char) 19;

        System.out.println( c );
        Log.i("ApplicationTest",mRandomChar+"----"+ 0x13);

        assertEquals(0,0);
    }
}