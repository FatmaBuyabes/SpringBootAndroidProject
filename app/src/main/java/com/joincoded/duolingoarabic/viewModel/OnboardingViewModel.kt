package com.joincoded.duolingoarabic.viewModel

import androidx.lifecycle.ViewModel

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
}
