package com.example.sportapp;

import androidx.annotation.NonNull;

public class Sport {
    private String name;
    private String description;
    private int imageResourseId;

    private Sport(String name, String description, int imageResourseId){
        this.name = name;
        this.description = description;
        this.imageResourseId = imageResourseId;
    }

    public static final Sport[] sports = {
            new Sport("Футбол", "Спортивная игра двух команд (по одиннадцать игроков" +
                    " в каждой), состоящая в том, что игроки стараются ударами ноги загнать мяч в " +
                    "ворота противника.\n", R.drawable.football),
            new Sport("Хоккей", "Командная игра на льду на коньках в небольшой мяч " +
                    "или шайбу, ударяемые клюшкой.\n", R.drawable.hockey),
            new Sport("Волейбол", "Спортивнвая игра в мяч, перебрасываемый руками " +
                    "через сетку от одной команды к другой.\n", R.drawable.volleyball),
            new Sport("Регби\n", "Спортивная командная игра с овальным мячом, " +
                    "который игроки передают друг другу руками и ногами, стараясь пересечь линию " +
                    "ворот противника.\n", R.drawable.rugby),
            new Sport("Танцы\n", "Ритмичные, выразительные телодвижения, обычно " +
                    "выстраиваемые в определенную композицию и исполняемые с музыкальным" +
                    " сопровождением.\n", R.drawable.dancing),
            new Sport("Баскетбол\n", "Игра, в которой мяч забрасывают руками в " +
                    "подвешенную сетку (называему корзиной) противной партии.\n", R.drawable.basketball),
            new Sport("Теннис\n", "Спортивная игра маленьким мячом, который " +
                    "перебрасывается ракеткой через сетку, разделяющую площадку.\n", R.drawable.tennis),
            new Sport("Плавание\n", "Вид спорта или спортивная дисциплина, " +
                    "заключающаяся в преодолении вплавь за наименьшее время различных " +
                    "дистанций.\n", R.drawable.swimming),
            new Sport("Каратэ", "Спортивная японская борьба, система самозащиты " +
                    "без оружия.\n", R.drawable.karate),
            new Sport("Бокс\n", "Кулачный бой в специальных перчатках по " +
                    "определенным правилам между двумя спортсменами.", R.drawable.boxing)

    };

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getImageResourseId() {
        return imageResourseId;
    }


    @Override
    public String toString(){
        return this.name;
    }


}












