/*
 * $Id: Test.java,v 1.1 2006/04/15 14:40:06 platform Exp $
 * Created on 2006-4-15
 */
package org.json.simple;

import org.json.simple.parser.ParseException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestJson {

    @Test
    public void testDecode() throws Exception {
        System.out.println("=======decode=======");

        String s = "[0,10]";
        Object obj = JSONValue.parse(s);
        JSONArray array = (JSONArray) obj;
        System.out.println("======the 2nd element of array======");
        System.out.println(array.get(1));
        System.out.println();
        assertEquals("10", array.get(1).toString());
    }

    @Test
    public void testJSONArrayCollection() {
        final ArrayList<String> testList = new ArrayList<String>();
        testList.add("First item");
        testList.add("Second item");
        final JSONArray jsonArray = new JSONArray(testList);

        assertEquals("[\"First item\",\"Second item\"]", jsonArray.toJSONString());
    }

    @Test
    public void testJSONObject() {
        final HashMap<String, String> obj = new HashMap<String, String>();
        obj.put("first-key", "first-value");
        obj.put("second-key", "second-value");
        final JSONObject jsonObject = new JSONObject(obj);

        assertEquals("{\"first-key\":\"first-value\",\"second-key\":\"second-value\"}", jsonObject.toJSONString());
    }

    @Test(expected = ParseException.class)
    public void testParserWithException() throws ParseException {
            String jsonString = "[\"one\",2,\"three\",4";
            JSONValue.parseWithException(jsonString);
    }

	@Test
	public void testJSONArrayBoolean() {
		final boolean[] testList = new boolean[3];
		testList[0] = true;
		testList[1] = true;
		final JSONArray jsonArray = new JSONArray(Collections.singleton(testList));

		assertEquals("[[true,true,false]]", jsonArray.toString());
	}
}
