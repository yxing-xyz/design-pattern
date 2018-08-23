package BehavioralPatterns.AdapterPattern;

public interface MediaPlayer {
    <T> void play(Class<T> cls, String filename) throws IllegalAccessException, InstantiationException;
}
