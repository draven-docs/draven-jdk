package com.noxus.draven.textblock;

import org.junit.jupiter.api.Test;

/**
 * 〈功能概述〉<br>
 *
 * @className: TextBlockTest
 * @package: com.noxus.draven.textblock
 * @author: draven
 * @date: 2021/2/28 09:16
 */
public class TextBlockTest {
    public static void main(String[] args) {
        String bock = """
                SELECT "EMP_ID", "LAST_NAME" FROM "EMPLOYEE_TB"
                              WHERE "CITY" = 'INDIANAPOLIS'
                              ORDER BY "EMP_ID", "LAST_NAME";
                """;
        System.out.println(bock);


        System.out.println((String) null);
    }


    @Test
    public void html() {

        String html = """
                ..............<html>
                ..............    <body>
                                    <p>Hello, world</p>
                ..............    </body>
                ..............</html>
                
                """;


        System.out.println(html.replace(".", ""));

        String s = html.stripIndent();
        System.out.println(s);

        String s1 = html.translateEscapes();
        System.out.println(s1);
        System.out.println("-----");


        String formatted = html.formatted();
        System.out.println(formatted);


        String trim = html.trim();
        System.out.println(trim);

    }
}
