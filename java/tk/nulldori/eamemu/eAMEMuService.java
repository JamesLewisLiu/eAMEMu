package tk.nulldori.eamemu;

import android.nfc.cardemulation.HostNfcFService;
import android.os.Bundle;

public class eAMEMuService extends HostNfcFService {
    @Override
    public byte[] processNfcFPacket(byte[] commandPacket, Bundle extras){
        return null;
    }

    @Override
    public void onDeactivated(int reason)
    {

    }
}
