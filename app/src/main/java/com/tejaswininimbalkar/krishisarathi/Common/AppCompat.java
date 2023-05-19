package com.omkarpawar.krishisarathi.Common;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.omkarpawar.krishisarathi.Common.Localization.LocaleManager;
import com.omkarpawar.krishisarathi.Common.SharedPreferences.IntroPref;


public class AppCompat extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        IntroPref pref = new IntroPref(this);
        super.onCreate(savedInstanceState);

        LocaleManager localeManager = new LocaleManager(this);
        localeManager.updateResources(pref.getLanguageCode());
    }
}