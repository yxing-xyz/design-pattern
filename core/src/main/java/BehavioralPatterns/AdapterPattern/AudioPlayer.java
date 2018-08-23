/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AudioPlayer
 * Author:   yuxing1994
 * Date:     2018/8/20 21:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package BehavioralPatterns.AdapterPattern;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/20
 * @since 1.0.0
 */
public class AudioPlayer implements MediaPlayer {

    @Override
    public <T> void play(Class<T> cls, String filename) throws IllegalAccessException, InstantiationException {
        T t = cls.newInstance();
        if (t instanceof MediaPlayer) {
            System.out.println("播放文件名:" + filename);
        } else if(t instanceof AdvancedMediaPlayer) {

        }
    }
}