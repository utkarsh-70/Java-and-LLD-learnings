Singleton Design Pattern – Quick Revision

Definition: Ensures only one instance of a class exists throughout the application and provides a global point of access.

Approaches

Eager Initialization

Instance created at class loading time (static instance).

✅ Simple, thread-safe.

❌ May create object even if unused.

Lazy Initialization

Instance created only when getInstance() is first called.

✅ Saves memory, created on demand.

❌ Not thread-safe without extra handling.

Synchronized Method

getInstance() marked synchronized to prevent race conditions.

✅ Thread-safe in multithreading.

❌ Synchronization adds performance overhead.

Double-Checked Locking (with volatile)

Checks instance before & inside synchronized block.

✅ Thread-safe, efficient, avoids unnecessary locks.

✅ Combines lazy loading + performance.