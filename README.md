# notion-svc-queue-mesh

`notion-svc-queue-mesh` is a Kotlin project in backend services. Its focus is to design a Kotlin verification harness for queue systems, covering format conversion, round-trip fixtures, and failure-oriented tests.

## Reason For The Project

This is intentionally local and self-contained so it can be inspected without credentials, services, or seeded history.

## Notion Svc Queue Mesh Review Notes

For a quick review, compare `queue pressure` with `worker slack` before reading the middle cases.

## What It Does

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/notion-svc-queue-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `queue pressure` and `worker slack`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## How It Is Put Together

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The Kotlin addition stays small enough to inspect in one sitting.

## Run It

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Check It

That command is also the regression path. It verifies the domain cases and catches mismatches between the CSV, metadata, and code.

## Boundaries

No external service is required. A deeper version would add more negative cases and a clearer boundary around invalid input.
