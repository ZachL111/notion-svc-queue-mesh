# Review Journal

The cases below are the review handles I would use before changing the implementation.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its backend services focus without claiming live deployment or external usage.

## Cases

- `baseline`: `queue pressure`, score 155, lane `ship`
- `stress`: `retry load`, score 142, lane `ship`
- `edge`: `worker slack`, score 119, lane `watch`
- `recovery`: `session drift`, score 160, lane `ship`
- `stale`: `queue pressure`, score 209, lane `ship`

## Note

A future change should add new cases before it changes the scoring rule.
