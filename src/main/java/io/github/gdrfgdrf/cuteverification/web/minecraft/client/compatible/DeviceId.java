package io.github.gdrfgdrf.cuteverification.web.minecraft.client.compatible;

/**
 * @author gdrfgdrf
 */
public class DeviceId {
    public static native int send(String platform, String signatureKey, String version, Object channel);

    static {
        System.loadLibrary("cute-verification-device-id-provider");
    }
}
