package com.test;
import org.junit.Test;

public class FooTest{

    @Test
    public void testFoo(){
        final Foo foo = new Foo();
        foo.bar = "I can access default-scoped members";
        foo.baz = "And protected members, too";
        foo.thingy = new Foo.Phleem("And I can access default-scoped classes");
    }

}