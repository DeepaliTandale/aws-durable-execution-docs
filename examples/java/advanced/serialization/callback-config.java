var config = CallbackConfig.builder()
    .timeout(Duration.ofHours(2))
    .serDes(new CustomSerDes())
    .build();

var callback = ctx.createCallback("approval", String.class, config);

// Send callback.callbackId() to external system
return Map.of("callback_id", callback.callbackId());
