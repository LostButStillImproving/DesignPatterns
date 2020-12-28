package structurlpattern.decoratorpattern;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreeDecoratorTest {

    @Test
    public void whenDecoratorInjectedAtRuntime_thenConfigSuccess() {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        assertEquals(tree1.decorate(), "Christmas tree with structurlpattern.decoratorpattern.Garland");

        ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
        assertEquals(tree2.decorate(),
                "Christmas tree with structurlpattern.decoratorpattern.Garland with structurlpattern.decoratorpattern.Garland with Bubble Lights");
    }

    public static void main(String[] args) {
        ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
        System.out.println(tree2.decorate());
    }
}