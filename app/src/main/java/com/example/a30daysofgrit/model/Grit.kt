package com.example.a30daysofgrit.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysofgrit.R

data class Grit (
    @StringRes val day: Int,
    @StringRes val title: Int,
    @DrawableRes val image: Int,
    @StringRes val grit: Int
)

object GritCollection{
    val girts=listOf(
        Grit(
            day = R.string.day1,
            title = R.string.title1,
            image = R.drawable.image1,
            grit = R.string.quote1
        ),
        Grit(
            day = R.string.day2,
            title = R.string.title2,
            image = R.drawable.image2,
            grit = R.string.quote2
        ),
        Grit(
            day = R.string.day3,
            title = R.string.title3,
            image = R.drawable.image3,
            grit = R.string.quote3
        ),
        Grit(
            day = R.string.day4,
            title = R.string.title4,
            image = R.drawable.image4,
            grit = R.string.quote4
        ),
        Grit(
            day = R.string.day5,
            title = R.string.title5,
            image = R.drawable.image5,
            grit = R.string.quote5
        ),
        Grit(
            day = R.string.day6,
            title = R.string.title6,
            image = R.drawable.image6,
            grit = R.string.quote6
        ),
        Grit(
            day = R.string.day7,
            title = R.string.title7,
            image = R.drawable.image7,
            grit = R.string.quote7
        ),
        Grit(
            day = R.string.day8,
            title = R.string.title8,
            image = R.drawable.image8,
            grit = R.string.quote8
        ),
        Grit(
            day = R.string.day9,
            title = R.string.title9,
            image = R.drawable.image9,
            grit = R.string.quote9
        ),
        Grit(
            day = R.string.day10,
            title = R.string.title10,
            image = R.drawable.image10,
            grit = R.string.quote10
        ),
        Grit(
            day = R.string.day11,
            title = R.string.title11,
            image = R.drawable.image11,
            grit = R.string.quote11
        ),
        Grit(
            day = R.string.day12,
            title = R.string.title12,
            image = R.drawable.image12,
            grit = R.string.quote12
        ),
        Grit(
            day = R.string.day13,
            title = R.string.title13,
            image = R.drawable.image13,
            grit = R.string.quote13
        ),
        Grit(
            day = R.string.day14,
            title = R.string.title14,
            image = R.drawable.image14,
            grit = R.string.quote14
        ),
        Grit(
            day = R.string.day15,
            title = R.string.title15,
            image = R.drawable.image15,
            grit = R.string.quote15
        ),
        Grit(
            day = R.string.day16,
            title = R.string.title16,
            image = R.drawable.image16,
            grit = R.string.quote16
        ),
        Grit(
            day = R.string.day17,
            title = R.string.title17,
            image = R.drawable.image17,
            grit = R.string.quote17
        ),
        Grit(
            day = R.string.day18,
            title = R.string.title18,
            image = R.drawable.image18,
            grit = R.string.quote18
        ),
        Grit(
            day = R.string.day19,
            title = R.string.title19,
            image = R.drawable.image19,
            grit = R.string.quote19
        ),
        Grit(
            day = R.string.day20,
            title = R.string.title20,
            image = R.drawable.image20,
            grit = R.string.quote20
        ),
        Grit(
            day = R.string.day21,
            title = R.string.title21,
            image = R.drawable.image21,
            grit = R.string.quote21
        ),
        Grit(
            day = R.string.day22,
            title = R.string.title22,
            image = R.drawable.image22,
            grit = R.string.quote22
        ),
        Grit(
            day = R.string.day23,
            title = R.string.title23,
            image = R.drawable.image23,
            grit = R.string.quote23
        ),
        Grit(
            day = R.string.day24,
            title = R.string.title24,
            image = R.drawable.image24,
            grit = R.string.quote24
        ),
        Grit(
            day = R.string.day25,
            title = R.string.title25,
            image = R.drawable.image25,
            grit = R.string.quote25
        ),
        Grit(
            day = R.string.day26,
            title = R.string.title26,
            image = R.drawable.image26,
            grit = R.string.quote26
        ),
        Grit(
            day = R.string.day27,
            title = R.string.title27,
            image = R.drawable.image27,
            grit = R.string.quote27
        ),
        Grit(
            day = R.string.day28,
            title = R.string.title28,
            image = R.drawable.image28,
            grit = R.string.quote28
        ),
        Grit(
            day = R.string.day29,
            title = R.string.title29,
            image = R.drawable.image29,
            grit = R.string.quote29
        ),
        Grit(
            day = R.string.day30,
            title = R.string.title30,
            image = R.drawable.image30,
            grit = R.string.quote30
        )
    )
}