public class Adapter implements TableData {
    private static final int COL_NUM = 4;
    private static final int COL_SPACING = 2;
    private static final int ROW_SPACING = 0;
    private static final char HEADER_UNDERLINE = '-';
    private static final int FIRST_NAME = 0;
    private static final int LAST_NAME = 1;
    private static final int PHONE = 2;
    private static final int EMAIL = 3;
    private static final int COL_WIDTH = 19;

    private ContactManager contactManager;

    public Adapter(ContactManager contactManager) {
        this.contactManager = contactManager;
    }

    @Override
    public int getColumnCount() {
        return COL_NUM;
    }

    @Override
    public int getRowCount() {
        int row = contactManager.getContactCount();
        return row;
    }

    @Override
    public int getColumnSpacing() {
        return COL_SPACING;
    }

    @Override
    public int getRowSpacing() {
        return ROW_SPACING;
    }

    @Override
    public char getHeaderUnderline() {
        return HEADER_UNDERLINE;
    }

    @Override
    public String getColumnHeader(int col) {
        String columnHeader;
        switch (col) {
            case FIRST_NAME: columnHeader = "First Name";
            break;
            case LAST_NAME: columnHeader = "Lastname";
            break;
            case PHONE: columnHeader = "Phone";
            break;
            case EMAIL: columnHeader = "Email";
            break;
            default: columnHeader = "First name";
            break;
        }
        return columnHeader;
    }


    @Override
    public int getColumnWidth(int col) {
        return COL_WIDTH;
    }

    @Override
    public Justification getColumnJustification(int col) {
        Justification justification;
        switch (col) {
            case FIRST_NAME:
                return Justification.Left;
            case LAST_NAME:
                return Justification.Left;
            case PHONE:
                return Justification.Center;
            case EMAIL:
                return Justification.Left;
            default:
                return Justification.Center;
        }
    }

    @Override
    public String getCellValue(int row, int col) {
        String column;
        String value;
        switch (col) {
            case FIRST_NAME: column = "First Name";
                value = contactManager.getContact(row).getFirstName();
                break;
            case LAST_NAME: column = "Lastname";
                value = contactManager.getContact(row).getLastName();
                break;
            case PHONE: column = "Phone";
                value = contactManager.getContact(row).getPhone();
                break;
            case EMAIL: column = "Email";
                value = contactManager.getContact(row).getEmail();
                break;
            default: column = "First name";
            value = contactManager.getContact(row).getFirstName();
            break;
        }
        return value;
    }
}
