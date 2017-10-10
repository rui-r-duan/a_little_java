package pie;

interface PieVisitorI {
    Object forBot(Bottom that);
    Object forTop(Top that);
}
