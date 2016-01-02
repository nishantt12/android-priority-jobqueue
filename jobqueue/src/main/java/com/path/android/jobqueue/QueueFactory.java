package com.path.android.jobqueue;

import android.content.Context;

import com.path.android.jobqueue.timer.Timer;

/**
 * Interface to supply custom {@link JobQueue}s for JobManager
 */
public interface QueueFactory {
    public JobQueue createPersistentQueue(Context context, Long sessionId, String id,
            boolean inTestMode, Timer timer);
    public JobQueue createNonPersistent(Context context, Long sessionId, String id,
            boolean inTestMode, Timer timer);
}