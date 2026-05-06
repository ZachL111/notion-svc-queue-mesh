# Field Notes

The fixture is small on purpose, which makes each domain case carry real weight.

The domain cases cover `queue pressure`, `retry load`, `worker slack`, and `session drift`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`stale` is the strongest case at 209 on `queue pressure`. `edge` is the cautious anchor at 119 on `worker slack`.

The language-specific addition keeps the review model in a JVM-friendly data class.
