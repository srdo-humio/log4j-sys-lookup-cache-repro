This demonstrates Log4j's caching behavior for system property lookups.

If the logging system is initialized when the system property has no value, the lookup will be performed for every log event,
and so the logs will reflect the actual value of the system property over time.

If the logging system is initialized when the system property already has a value (or a default is set in the Log4j config),
that value ends up hardcoded into the Layout in place of the system property placeholder, so the initial value sticks permanently in the logs.

