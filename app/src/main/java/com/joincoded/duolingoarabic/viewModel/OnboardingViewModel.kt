package com.joincoded.duolingoarabic.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

class OnboardingViewModel : ViewModel() {
    var onboardingCompleted: Boolean = false
        private set

    var onboardingQuestionCompleted: Boolean = false
        private set

    fun completeOnboarding() {
        onboardingCompleted = true
    }

    fun completeOnboardingQuestion() {
        onboardingQuestionCompleted = true
    }

    fun checkLoggedIn(isLoggedIn: Boolean) {
        if (isLoggedIn) {
            completeOnboarding()
        }
    }
}
