# Notion Svc Queue Mesh Walkthrough

This walk-through keeps the domain vocabulary close to the data instead of burying it in prose.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 155 | ship |
| stress | retry load | 142 | ship |
| edge | worker slack | 119 | watch |
| recovery | session drift | 160 | ship |
| stale | queue pressure | 209 | ship |

Start with `stale` and `edge`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `queue pressure` against `worker slack`, not the raw score alone.
