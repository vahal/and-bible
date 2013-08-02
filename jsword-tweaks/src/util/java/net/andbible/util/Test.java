package net.andbible.util;

import java.util.Locale;


import org.crosswire.common.util.CallContext;
import org.crosswire.jsword.JSMsg;
import org.crosswire.jsword.book.Book;
import org.crosswire.jsword.book.BookException;
import org.crosswire.jsword.book.Books;
import org.crosswire.jsword.passage.*;
import org.crosswire.jsword.versification.system.Versifications;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
       new Test().testObadiah();
//		new Test().testInvalidKey();
//		new Test().testCallContext();
//
//		Locale.setDefault(Locale.FRENCH);
//		String jobName = JSMsg.gettext("Creating index. Processing {0}", "ABC");
//		System.out.println(jobName);
//
//		Locale.setDefault(Locale.GERMAN);
//		String msg = JSMsg.gettext("No entry for '{0}' in {1}.", "ONE", "TWO");
//		System.out.println(msg);
		

	}

    public void testObadiah() {
        try {
            Key obd = PassageKeyFactory.instance().getKey(Versifications.instance().getVersification("KJV"), "Obd");
            System.out.println(obd);
            Verse verse = KeyUtil.getVerse(obd);
            System.out.println(verse);

            Key obd1 = PassageKeyFactory.instance().getKey(Versifications.instance().getVersification("KJV"), "Obd 1");
            System.out.println(obd1);
            Verse verse1 = KeyUtil.getVerse(obd1);
            System.out.println(verse1);
        } catch (NoSuchKeyException e) {
            e.printStackTrace();
        }
    }
//    public void testInvalidKey() {
//        Book book = Books.installed().getBook("Pilgrim");
//        if (book != null) {
//            Key key = book.getGlobalKeyList();
//            try {
//                book.getRawText(key);
//            } catch (NullPointerException e) {
//                Assert.fail("test for bad key should not have thrown an NPE.");
//            } catch (BookException e) {
//            	System.out.println(e.getMessage());
//                Assert.assertEquals("testing for a bad key", "No entry for '' in Pilgrim.", e.getMessage());
//            }
//        }
//    }
//
//    public void testCallContext() {
//		System.out.println(CallContext.getCallingClass());
//		Assert.assertEquals("net.andbible.util.Test",CallContext.getCallingClass().getName());
//    }

}
