package littlejava.pie;

interface PieVisitorI {
    PieD forBot();
    PieD forTop(Object t, PieD r);
}