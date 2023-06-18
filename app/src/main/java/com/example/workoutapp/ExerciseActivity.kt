package com.example.workoutapp


import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View


import com.example.workoutapp.databinding.ActivityExerciseBinding
import kotlin.math.cos


class ExerciseActivity : AppCompatActivity() {
    var mediaPlayer:MediaPlayer?=null
    lateinit var binding: ActivityExerciseBinding
    var restTimer: CountDownTimer? = null
    var exerciseTimer: CountDownTimer? = null
    var exerciseProgress = 0
    var restProgress = 0
    lateinit var exercise:ArrayList<exerciseModel>
    var id=-1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarExercise)
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
        binding.toolbarExercise.setNavigationOnClickListener {
            onBackPressed()
        }
        exercise=cosntants.defaultExercises()

        resetTimeState()
    }

    private fun resetTimeState() {
        if (restTimer != null) {
            restTimer?.cancel()
            restProgress = 0
        }
        id++
        setTimeState()
    }

    private fun resetExerciseState() {
        if (exerciseTimer != null) {
            exerciseTimer?.cancel()
            exerciseProgress = 0
        }
        if(id<=11)
        { setExerciseTimer()}
    }

    private fun setTimeState() {
        binding.framelayout.visibility = View.VISIBLE

        binding.framelayoutExercise.visibility = View.INVISIBLE

        binding.progressBar.progress = 10 - restProgress
        binding.tvProgress.text = (10 - restProgress).toString()
        restTimer = object : CountDownTimer(10000, 1000) {
            override fun onTick(p0: Long) {
                restProgress++
                binding.progressBar.progress = 10 - restProgress
                binding.tvProgress.text = (10 - restProgress).toString()

            }

            override fun onFinish() {
               mediaPlayer=MediaPlayer.create(this@ExerciseActivity,R.raw.press_start)
                mediaPlayer!!.isLooping=false
                mediaPlayer!!.start()
                resetExerciseState()
            }

        }.start()
    }

    private fun setExerciseTimer() {
        binding.framelayout.visibility = View.INVISIBLE
        binding.framelayoutExercise.visibility = View.VISIBLE
        binding.progressBarExercise.progress = 30 - exerciseProgress
        binding.textview2.text = exercise[id].name
        binding.exerciseImage.setImageResource(exercise[id].image)
        exerciseTimer = object : CountDownTimer(30000, 1000) {
            override fun onTick(p0: Long) {

                exerciseProgress++
                binding.progressBarExercise.progress = 30 - exerciseProgress
                binding.tvProgressExercise.text = (30 - exerciseProgress).toString()
            }

            override fun onFinish() {
                mediaPlayer=MediaPlayer.create(this@ExerciseActivity,R.raw.press_start)
                mediaPlayer!!.isLooping=false
                mediaPlayer!!.start()
                resetExerciseState()
                binding.textview1.text="REST TIME"
                resetTimeState()
            }

        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        if (restTimer != null) {
            restTimer?.cancel()
            restProgress = 0
        }
        if (exerciseTimer != null) {
            exerciseTimer?.cancel()
            exerciseProgress = 0
        }

    }
}