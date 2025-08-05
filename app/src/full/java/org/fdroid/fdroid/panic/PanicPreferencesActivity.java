package org.fdroid.fdroid.panic;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;

import org.fdroid.fdroid.FDroidApp;
import org.fdroid.fdroid.R;

public class PanicPreferencesActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle bundle) {
        if (org.fdroid.fdroid.Preferences.get().isPureBlack()) {
            getTheme().applyStyle(R.style.ThemeOverlay_App_PureBlack, true);
        }

        FDroidApp fdroidApp = (FDroidApp) getApplication();
        fdroidApp.setSecureWindow(this);

        super.onCreate(bundle);
        setContentView(R.layout.activity_panic_settings);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
