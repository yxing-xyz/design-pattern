/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MediaPlayer
 * Author:   yuxing1994
 * Date:     2018/8/29 20:53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package StructuralPatterns.AdapterPattern.MediaPlayer;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/29
 * @since 1.0.0
 */
public interface MediaPlayer {
    public void play(String audioType, String fileName);
}