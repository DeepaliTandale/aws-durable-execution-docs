import software.amazon.lambda.durable.model.ExecutionStatus;
import software.amazon.lambda.durable.testing.LocalDurableTestRunner;

@Test
void testMyFunction() {
    var handler = new MyHandler();
    var runner = LocalDurableTestRunner.create(Map.class, handler);

    var result = runner.runUntilComplete(Map.of("data", "test"));

    assertEquals(ExecutionStatus.SUCCEEDED, result.getStatus());
}
