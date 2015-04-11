/* Generated By:JavaCC: Do not edit this line. BibTeX.java */
package compilador;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BibTeX implements BibTeXConstants {
  public static void main(String args []) throws ParseException, IOException
  {
    String fname = "";
    Scanner sc = new Scanner(System.in);
    while(fileExist(fname) != true)
    {
            System.out.print("Introduza o ficheiro que pretende usar > ");
            fname = sc.nextLine();
        }

        BibTeX parser = new BibTeX( new FileInputStream(new File(fname)));
        parser.start();
        sc.close();
  }

  private static boolean fileExist(String filename) {
        File file = new File(filename);
        return file.exists();
  }

  static final public void start() throws ParseException {
               Token t1;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ARTICLE:
      t1 = jj_consume_token(ARTICLE);
                article();
      break;
    case BOOK:
      t1 = jj_consume_token(BOOK);

      break;
    case BOOKLET:
      t1 = jj_consume_token(BOOKLET);

      break;
    case CONFERENCE:
      t1 = jj_consume_token(CONFERENCE);

      break;
    case INBOOK:
      t1 = jj_consume_token(INBOOK);

      break;
    case INCOLLECTION:
      t1 = jj_consume_token(INCOLLECTION);

      break;
    case MANUAL:
      t1 = jj_consume_token(MANUAL);

      break;
    case MASTERTHESIS:
      t1 = jj_consume_token(MASTERTHESIS);

      break;
    case MISC:
      t1 = jj_consume_token(MISC);

      break;
    case PHDTHESIS:
      t1 = jj_consume_token(PHDTHESIS);

      break;
    case PROCEEDINGS:
      t1 = jj_consume_token(PROCEEDINGS);

      break;
    case TECHREPORT:
      t1 = jj_consume_token(TECHREPORT);

      break;
    case UNPUBLISHED:
      t1 = jj_consume_token(UNPUBLISHED);

      break;
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void definition() throws ParseException {
    jj_consume_token(44);
    jj_consume_token(45);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case WORD:
      jj_consume_token(WORD);
      break;
    default:
      jj_la1[1] = jj_gen;
      ;
    }
    jj_consume_token(45);
  }

  static final public void article() throws ParseException {
    jj_consume_token(46);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case WORD:
      jj_consume_token(WORD);
      break;
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    jj_consume_token(47);
    jj_consume_token(AUTHOR);
    definition();
    jj_consume_token(47);
    jj_consume_token(TITLE);
    definition();
    jj_consume_token(47);
    jj_consume_token(JOURNAL);
    definition();
    jj_consume_token(47);
    jj_consume_token(YEAR);
    definition();
    jj_consume_token(47);
    jj_consume_token(VOLUME);
    definition();
    jj_consume_token(47);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMBER:
      jj_consume_token(NUMBER);
      definition();
      jj_consume_token(47);
      break;
    default:
      jj_la1[3] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PAGES:
      jj_consume_token(PAGES);
      definition();
      jj_consume_token(47);
      break;
    default:
      jj_la1[4] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MONTH:
      jj_consume_token(MONTH);
      definition();
      jj_consume_token(47);
      break;
    default:
      jj_la1[5] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NOTE:
      jj_consume_token(NOTE);
      definition();
      jj_consume_token(47);
      break;
    default:
      jj_la1[6] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case KEY:
      jj_consume_token(KEY);
      definition();
      jj_consume_token(47);
      break;
    default:
      jj_la1[7] = jj_gen;
      ;
    }
    jj_consume_token(48);
  }

  static final public void book() throws ParseException {
    jj_consume_token(BOOK);
    jj_consume_token(46);
    jj_consume_token(WORD);
    jj_consume_token(47);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AUTHOR:
      jj_consume_token(AUTHOR);
      definition();
      break;
    case EDITOR:
      jj_consume_token(EDITOR);
      definition();
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(47);
    jj_consume_token(TITLE);
    definition();
    jj_consume_token(47);
    jj_consume_token(PUBLISHER);
    definition();
    jj_consume_token(47);
    jj_consume_token(YEAR);
    definition();
    jj_consume_token(47);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VOLUME:
    case NUMBER:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VOLUME:
        jj_consume_token(VOLUME);
        definition();
        break;
      case NUMBER:
        jj_consume_token(NUMBER);
        definition();
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(47);
      break;
    default:
      jj_la1[10] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SERIES:
      jj_consume_token(SERIES);
      definition();
      jj_consume_token(47);
      break;
    default:
      jj_la1[11] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ADDRESS:
      jj_consume_token(ADDRESS);
      definition();
      jj_consume_token(47);
      break;
    default:
      jj_la1[12] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case EDITION:
      jj_consume_token(EDITION);
      definition();
      jj_consume_token(47);
      break;
    default:
      jj_la1[13] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MONTH:
      jj_consume_token(MONTH);
      definition();
      jj_consume_token(47);
      break;
    default:
      jj_la1[14] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NOTE:
      jj_consume_token(NOTE);
      definition();
      jj_consume_token(47);
      break;
    default:
      jj_la1[15] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case KEY:
      jj_consume_token(KEY);
      definition();
      jj_consume_token(47);
      break;
    default:
      jj_la1[16] = jj_gen;
      ;
    }
    jj_consume_token(48);
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public BibTeXTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[17];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x7f7e0,0x0,0x0,0x1000000,0x2000000,0x4000000,0x8000000,0x10000000,0x20080000,0x1800000,0x1800000,0x80000000,0x0,0x0,0x4000000,0x8000000,0x10000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x800,0x800,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1,0x2,0x0,0x0,0x0,};
   }

  /** Constructor with InputStream. */
  public BibTeX(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public BibTeX(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new BibTeXTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public BibTeX(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new BibTeXTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public BibTeX(BibTeXTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(BibTeXTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[49];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 17; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 49; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}