package pro1p2_víctorromero;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import java.io.File;

public class Audio extends Thread {

    private AudioInputStream audioIS;
    private Clip clip;
    private File file;

    public Audio() {
    }

    public Audio(String path) {
        file = new File(path);

    }

    public AudioInputStream getAudioInputStream() {
        return audioIS;
    }

    public void setAudioInputStream(AudioInputStream audioInputStream) {
        this.audioIS = audioInputStream;
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
        return "AudioThread{" + "audioInputStream=" + audioIS + ", clip=" + clip + ", file=" + file + '}';
    }

    public void run() {
        boolean banderita = true;
        while (banderita) {
            try {
                if (file.exists()) {
                    audioIS = AudioSystem.getAudioInputStream(file);

                    clip = AudioSystem.getClip();
                    clip.open(audioIS);
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
}
