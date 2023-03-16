package pro1p2_víctorromero;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import java.io.File;

public class Audio extends Thread {

    private AudioInputStream audioInputStream;
    private Clip clip;
    private File file;

    public Audio() {
    }

    public Audio(String path) {
        file = new File(path);

    }

    public void run() {
        while (true) {
            try {
                if (file.exists()) {

                    audioInputStream = AudioSystem.getAudioInputStream(file);

                    clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.loop(Clip.LOOP_CONTINUOUSLY);

                    int time2 = (int) clip.getMicrosecondLength() / 1000;

                    int time3 = 0;
                    while (time3 < time2) {
                        Thread.sleep(1);
                        time3++;

                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public AudioInputStream getAudioInputStream() {
        return audioInputStream;
    }

    public void setAudioInputStream(AudioInputStream audioInputStream) {
        this.audioInputStream = audioInputStream;
    }

    public Clip getClip() {
        return clip;
    }

    public void setClip(Clip clip) {
        this.clip = clip;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "AudioThread{" + "audioInputStream=" + audioInputStream + ", clip=" + clip + ", file=" + file + '}';
    }

}
