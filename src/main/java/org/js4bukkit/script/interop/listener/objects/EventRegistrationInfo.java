package org.js4bukkit.script.interop.listener.objects;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.bukkit.event.Event;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.js4bukkit.basic.impl.ObjectNameImpl;

/**
 * 监听器注册的相关信息。
 *
 * @author NaerQAQ
 * @version 1.0
 * @since 2023/10/14
 */
@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false, exclude = "listener")
public class EventRegistrationInfo extends ObjectNameImpl {
    /**
     * 用于绑定事件监听的对象。
     */
    private final Listener listener = new Listener() {
    };

    /**
     * 事件类。
     */
    private Class<? extends Event> eventClass;

    /**
     * 当该事件被取消，是否依然执行。
     */
    private boolean ignoreCancelled = false;

    /**
     * 事件优先级。
     */
    private EventPriority eventPriority = EventPriority.NORMAL;
}
