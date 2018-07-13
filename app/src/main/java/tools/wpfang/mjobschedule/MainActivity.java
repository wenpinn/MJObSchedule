package tools.wpfang.mjobschedule;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    JobScheduler jobScheduler;
    JobInfo jobInfo;
    private static final int JOB_ID=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jobScheduler= (JobScheduler) getSystemService(JOB_SCHEDULER_SERVICE);
    }

    public void doJobScheduler(View view) {
        JobInfo.Builder builder=new JobInfo.Builder(JOB_ID,
                new ComponentName(getPackageName(),MyOwnJOB.class.getName()));
        builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY);
        builder.setRequiresCharging(true);
        builder.setRequiresDeviceIdle(false);

        jobInfo=builder.build();
        jobScheduler.schedule(jobInfo);
    }
}
