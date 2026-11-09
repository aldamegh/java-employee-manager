# Java Employee Manager

A small console employee manager demonstrating classes, arrays, search, department-based salary lookup, and example bonus calculations.

## Course and original date

- **Course / المادة:** CSC 111 - Computer Programming I / برمجة الحاسبات 1, King Saud University.
- **Original project period / تاريخ المشروع الأصلي:** 9-11 December 2020.
- **Evidence:** The original employee-project ZIP contains Java sources dated 9 December 2020; the later Eclipse `AldameghProject` sources were last modified on 10-11 December 2020. The publication uses the reviewed version of that later source.

The original coursework dates above are distinct from the GitHub publication and maintenance date, **9 November 2026**. The original source files were preserved locally.

## Run

JDK 11 or newer with `javac` and `java` on PATH; Java 8-compatible output. No external Java dependencies.

```sh
mkdir build
javac --release 8 -encoding UTF-8 -d build src/*.java
java -cp build Company
```

## Verification

```sh
python check.py
```

12 employee-management assertions and a scripted console interaction passed. Checks use newly authored synthetic inputs only. See [CHANGES.md](CHANGES.md) for the publication changes and validation scope.

## Scope and provenance

Stores at most 50 fictional employees in memory. It has no persistence or authentication, expects correctly typed input, and uses single-word names and departments.

Published from the owner's local coursework. Course briefs, slides, exams, student identifiers, faculty names, real datasets, collected email, credentials, IDE history, and compiled files are excluded. Academic material may include supplied interfaces or collaborative code; no claim of sole authorship of all scaffolding and no blanket license is made.

Course titles are cross-checked against the [KSU computer science course catalog](https://ccis.ksu.edu.sa/en/cs/cs-prog-guides). Original local evidence is retained privately rather than publishing the source briefs/reports.
