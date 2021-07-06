package com.example.responsi1_ahmadrafli;

import java.util.ArrayList;
import java.util.List;

public class DistroData {
    private static String[] names = {
            "Manjaro Linux",
            "Linux Mint",
            "Pop!_OS",
    };
    private static String[] infos = {
            "Manjaro Linux is a fast, user-friendly, desktop-oriented operating system based on Arch Linux.",
            "Linux Mint is an Ubuntu-based distribution whose goal is to provide a classic desktop experience with many convenient",
            "Pop!_OS is an Ubuntu-based Linux distribution featuring a custom GNOME desktop. ",
    };
    private static int[] logos = {
            R.drawable.mission,
            R.drawable.pay,
            R.drawable.success,
    };
    public static List<Distro> getDatas() {
        ArrayList<Distro> distros = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            Distro distro = new Distro(names[i], infos[i], logos[i]);
            distros.add(distro);
        }
        return distros;
    }
}