package demo;

import a.does.not.Exists0;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pinyin4jAppletDemo extends JApplet {
    private static final Dimension APP_SIZE = null;
    private static String appName = null;
    private static final long serialVersionUID = -1934962385592030162L;
    private JPanel buttonPanel;
    String[] caseTypes;
    private JComboBox caseTypesComboBox;
    private JLabel charLabel;
    private JTextField charTextField;
    private JButton convertButton;
    private JPanel formattedCharPanel;
    private JTextArea formattedOutputField;
    private JPanel jContentPane;
    private JTabbedPane jTabbedPane;
    private JPanel optionPanel;
    private JLabel toneLabel;
    String[] toneTypes;
    private JComboBox toneTypesComboBox;
    private JPanel unformattedCharPanel;
    private JLabel unformattedGwoyeuRomatzyhLabel;
    private JPanel unformattedGwoyeuRomatzyhPanel;
    private JScrollPane unformattedGwoyeuRomatzyhScrollPane;
    private JTextArea unformattedGwoyeuRomatzyhTextArea;
    private JLabel unformattedHanyuPinyinLabel;
    private JPanel unformattedHanyuPinyinPanel;
    private JScrollPane unformattedHanyuPinyinScrollPane;
    private JTextArea unformattedHanyuPinyinTextArea;
    private JLabel unformattedMPS2PinyinLabel;
    private JPanel unformattedMPS2PinyinPanel;
    private JScrollPane unformattedMPS2PinyinScrollPane;
    private JTextArea unformattedMPS2PinyinTextArea;
    private JLabel unformattedTongyongPinyinLabel;
    private JPanel unformattedTongyongPinyinPanel;
    private JScrollPane unformattedTongyongPinyinScrollPane;
    private JTextArea unformattedTongyongPinyinTextArea;
    private JLabel unformattedWadePinyinLabel;
    private JPanel unformattedWadePinyinPanel;
    private JScrollPane unformattedWadePinyinScrollPane;
    private JTextArea unformattedWadePinyinTextArea;
    private JLabel unformattedYalePinyinLabel;
    private JPanel unformattedYalePinyinPanel;
    private JScrollPane unformattedYalePinyinScrollPane;
    private JTextArea unformattedYalePinyinTextArea;
    String[] vCharTypes;
    private JComboBox vCharTypesComboBox;

    /* renamed from: demo.Pinyin4jAppletDemo.1 */
    final class C03741 extends WindowAdapter {
        private final Pinyin4jAppletDemo val$appletDemo;

        static {
            fixHelper.fixfunc(new int[]{15593, 15594});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C03741(Pinyin4jAppletDemo pinyin4jAppletDemo);

        public final native void windowClosing(WindowEvent windowEvent);
    }

    /* renamed from: demo.Pinyin4jAppletDemo.2 */
    final class C03752 implements ActionListener {
        private final Pinyin4jAppletDemo this$0;

        static {
            fixHelper.fixfunc(new int[]{11833, 11834, 11835, 11836, 11837});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C03752(Pinyin4jAppletDemo pinyin4jAppletDemo);

        private native String concatPinyinStringArray(String[] strArr);

        private native void updateFormattedTextField(char c, String str, String str2, String str3);

        private native void updateUnformattedTextField(char c);

        public final native void actionPerformed(ActionEvent actionEvent);
    }

    /* renamed from: demo.Pinyin4jAppletDemo.3 */
    final class C03763 implements ActionListener {
        private final Pinyin4jAppletDemo this$0;

        static {
            fixHelper.fixfunc(new int[]{11965, 11966});
            if (VERSION.SDK_INT <= 0) {
                Exists0.class.toString();
            }
        }

        native C03763(Pinyin4jAppletDemo pinyin4jAppletDemo);

        public final native void actionPerformed(ActionEvent actionEvent);
    }

    static {
        fixHelper.fixfunc(new int[]{8123, 8124, 8125, 8126, 8127, 8128, 8129, 8130, 8131, 8132, 8133, 8134, 8135, 8136, 8137, 8138, 8139, 8140, 8141, 8142, 8143, 8144, 8145, 8146, 8147, 8148, 8149, 8150, 8151, 8152, 8153, 8154, 8155});
        __clinit__();
        if (VERSION.SDK_INT <= 0) {
            Exists0.class.toString();
        }
    }

    static void __clinit__() {
        APP_SIZE = new Dimension(600, 400);
        appName = "pinyin4j-2.0.0 applet demo";
    }

    static String access$000(Pinyin4jAppletDemo pinyin4jAppletDemo) {
        return pinyin4jAppletDemo.getChineseCharText();
    }

    static JComboBox access$100(Pinyin4jAppletDemo pinyin4jAppletDemo) {
        return pinyin4jAppletDemo.toneTypesComboBox;
    }

    static JTextArea access$1000(Pinyin4jAppletDemo pinyin4jAppletDemo) {
        return pinyin4jAppletDemo.formattedOutputField;
    }

    static JComboBox access$200(Pinyin4jAppletDemo pinyin4jAppletDemo) {
        return pinyin4jAppletDemo.vCharTypesComboBox;
    }

    static JComboBox access$300(Pinyin4jAppletDemo pinyin4jAppletDemo) {
        return pinyin4jAppletDemo.caseTypesComboBox;
    }

    static JTextArea access$400(Pinyin4jAppletDemo pinyin4jAppletDemo) {
        return pinyin4jAppletDemo.unformattedHanyuPinyinTextArea;
    }

    static JTextArea access$500(Pinyin4jAppletDemo pinyin4jAppletDemo) {
        return pinyin4jAppletDemo.unformattedTongyongPinyinTextArea;
    }

    static JTextArea access$600(Pinyin4jAppletDemo pinyin4jAppletDemo) {
        return pinyin4jAppletDemo.unformattedWadePinyinTextArea;
    }

    static JTextArea access$700(Pinyin4jAppletDemo pinyin4jAppletDemo) {
        return pinyin4jAppletDemo.unformattedMPS2PinyinTextArea;
    }

    static JTextArea access$800(Pinyin4jAppletDemo pinyin4jAppletDemo) {
        return pinyin4jAppletDemo.unformattedYalePinyinTextArea;
    }

    static JTextArea access$900(Pinyin4jAppletDemo pinyin4jAppletDemo) {
        return pinyin4jAppletDemo.unformattedGwoyeuRomatzyhTextArea;
    }

    private native JPanel getButtonPanel();

    private native JComboBox getCaseTypesComboBox();

    private native JTextField getCharTextField();

    private native String getChineseCharText();

    private native JButton getConvertButton();

    private native JPanel getFormattedCharPanel();

    private native JTextArea getFormattedOutputField();

    private native JPanel getJContentPane();

    private native JTabbedPane getJTabbedPane();

    private native JPanel getOptionPanel();

    private native JComboBox getToneTypesComboBox();

    private native JPanel getUnformattedCharPanel();

    private native JPanel getUnformattedGwoyeuRomatzyhPanel();

    private native JScrollPane getUnformattedGwoyeuRomatzyhScrollPane();

    private native JTextArea getUnformattedGwoyeuRomatzyhTextArea();

    private native JPanel getUnformattedHanyuPinyinPanel();

    private native JScrollPane getUnformattedHanyuPinyinScrollPane();

    private native JTextArea getUnformattedHanyuPinyinTextArea();

    private native JPanel getUnformattedMPS2PinyinPanel();

    private native JScrollPane getUnformattedMPS2PinyinScrollPane();

    private native JTextArea getUnformattedMPS2PinyinTextArea();

    private native JPanel getUnformattedTongyongPinyinPanel();

    private native JScrollPane getUnformattedTongyongPinyinScrollPane();

    private native JTextArea getUnformattedTongyongPinyinTextArea();

    private native JPanel getUnformattedWadePinyinPanel();

    private native JScrollPane getUnformattedWadePinyinScrollPane();

    private native JTextArea getUnformattedWadePinyinTextArea();

    private native JPanel getUnformattedYalePinyinPanel();

    private native JScrollPane getUnformattedYalePinyinScrollPane();

    private native JTextArea getUnformattedYalePinyinTextArea();

    private native JComboBox getVCharTypesComboBox();

    public static void main(String[] strArr) {
        Pinyin4jAppletDemo pinyin4jAppletDemo = new Pinyin4jAppletDemo();
        System.runFinalizersOnExit(true);
        JFrame jFrame = new JFrame(appName);
        jFrame.addWindowListener(new C03741(pinyin4jAppletDemo));
        jFrame.add("Center", pinyin4jAppletDemo);
        pinyin4jAppletDemo.init();
        pinyin4jAppletDemo.start();
        jFrame.setSize(APP_SIZE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    public native void init();
}
