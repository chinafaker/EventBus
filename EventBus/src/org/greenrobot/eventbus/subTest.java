package org.greenrobot.eventbus;

/**
 * @author hhb
 * @date 2019/11/26 19:56
 */
public class subTest {
    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void SubscribeTest() {

    }

    @Subscribe(sticky = true)
    public void stickyTest() {

    }

    @SubscribeTest(threadMode = ThreadMode.BACKGROUND)
    public void SubscribeTestTest() {
    }

    @SubscribeTest(sticky = true)
    public void stickyTestTest() {

    }
}
