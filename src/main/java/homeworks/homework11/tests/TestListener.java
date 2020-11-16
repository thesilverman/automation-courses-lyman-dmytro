package homeworks.homework11.tests;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class TestListener extends RunListener {

    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("--------------------------------");
        System.out.println("Result of the test run:");
        System.out.println("Run time: " + result.getRunTime() + "ms");
        System.out.println("Run count: " + result.getRunCount());
        System.out.println("Failure count: " + result.getFailureCount());
        System.out.println("Ignore count: " + result.getIgnoreCount());
    }

    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("testStarted" + description);
        System.out.println("--------------------------------");
    }

    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("testFinished" + description);
        System.out.println("--------------------------------");
    }

    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println("testFailure" + failure);
        System.out.println("testFailure" + failure.getMessage());
    }
}
