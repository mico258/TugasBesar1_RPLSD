package com.rplsd.scheduling;

import java.io.PrintWriter;

import org.antlr.v4.runtime.*;

public class App
{
    public static void main( String[] args )
    {
        ANTLRInputStream inputStream = new ANTLRInputStream(
                "I would like to [b]emphasize[/b] this and [u]underline [b]that[/b][/u]. " +
                        "Let's not forget to quote: [quote author=\"John\"]You're wrong![/quote]");
        scheduleLexer scheduleLexer = new scheduleLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(scheduleLexer);
        scheduleParser scheduleParser = new scheduleParser(commonTokenStream);


    }
}
