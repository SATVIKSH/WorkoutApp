package com.example.workoutapp

object cosntants {
    fun defaultExercises():ArrayList<exerciseModel>{
        var exercises=arrayListOf<exerciseModel>()
        var jump:exerciseModel=exerciseModel(
            0,
            "JUMPING JACKS",
             R.drawable.ic_jumping_jacks,
            false,
            false
        )
        exercises.add(jump)
        var lunge:exerciseModel=exerciseModel(
            1,
            "LUNGES",
            R.drawable.ic_lunge,
            false,
            false
        )
        exercises.add(lunge)
        var run:exerciseModel=exerciseModel(
            2,
            "HIGH KNEES RUNNING IN PLACE",
            R.drawable.ic_high_knees_running_in_place,
            false,
            false
        )
        exercises.add(run)
        var pushUp:exerciseModel=exerciseModel(
            3,
            "PUSH UPS",
            R.drawable.ic_push_up,
            false,
            false
        )
        exercises.add(pushUp)
        var plank:exerciseModel=exerciseModel(
            4,
            "PLANK",
            R.drawable.ic_plank,
            false,
            false
        )
        exercises.add(plank)
        var rotation:exerciseModel=exerciseModel(
            5,
            "PUSH UPS AND ROTATION",
            R.drawable.ic_push_up_and_rotation,
            false,
            false
        )
        exercises.add(rotation)
        var sidePlank:exerciseModel=exerciseModel(
            6,
            "SIDE PLANK",
            R.drawable.ic_side_plank,
            false,
            false
        )
        exercises.add(sidePlank)
        var squat:exerciseModel=exerciseModel(
            7,
            "SQUATS",
            R.drawable.ic_squat,
            false,
            false
        )
        exercises.add(squat)
        var abdominal:exerciseModel=exerciseModel(
            8,
            "ABDOMINAL CRUNCHES",
            R.drawable.ic_abdominal_crunch,
            false,
            false
        )
        exercises.add(abdominal)
        var step:exerciseModel=exerciseModel(
            9,
            "STEP UP ONTO CHAIR",
            R.drawable.ic_step_up_onto_chair,
            false,
            false
        )
        exercises.add(step)
        var triceps:exerciseModel=exerciseModel(
            10,
            "TRICEPS DIP ON CHAIR",
            R.drawable.ic_triceps_dip_on_chair,
            false,
            false
        )
        exercises.add(triceps)
        var sit:exerciseModel=exerciseModel(
            11,
            "WALL SIT",
            R.drawable.ic_wall_sit,
            false,
            false
        )

        exercises.add(sit)
        return exercises
    }
}