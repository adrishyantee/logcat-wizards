package com.example.logcathealth.ui.DocCorner;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DocCornerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DocCornerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is docCorner fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}