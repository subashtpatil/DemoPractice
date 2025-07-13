package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExCaseInSensitive {
    public static void main(String[] args)
    {
        //public int cnt;
        // the string we want to search in
        String str = "happYyy Y Y"; // happy new year";

        // search for this simple pattern
        String sub_str ="Y";				// " ye.* ";

        // set everything up
      // Pattern p = Pattern.compile(sub_str);    //Case sensitive
        Pattern p = Pattern.compile(sub_str, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        int res=0;

        // now see if we find a match
        while (m.find()) {
            res++;
        }
        System.out.println("Found a match, "+ res+" times ");
    }
}
//Found a match, 5 times