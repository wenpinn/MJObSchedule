package tools.wpfang.mjobschedule;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.widget.Toast;

public class MyOwnJOB  extends JobService{
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this,"Job getting created",Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Toast.makeText(this,"Job started",Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        Toast.makeText(this,"Job Problem",Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Job Finished",Toast.LENGTH_SHORT).show();

    }
}
