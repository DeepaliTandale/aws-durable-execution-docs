import software.amazon.lambda.durable.model.ExecutionStatus;
import software.amazon.lambda.durable.testing.LocalDurableTestRunner;

@Test
void testSuccess() {
    var runner = LocalDurableTestRunner.create(Map.class, new MyHandler());

    var result = runner.runUntilComplete(Map.of("data", "test"));

    assertEquals(ExecutionStatus.SUCCEEDED, result.getStatus());
}
