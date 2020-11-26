package it.michele.changescene;

public enum Transitions {

    FADE(R.anim.fade_in, R.anim.fade_out),
    SLIDE_DOWN(R.anim.slide_in_down, R.anim.slide_out_down);

    private int anim_in;
    private int anim_out;

    Transitions(int anim_in, int anim_out){
        this.anim_in = anim_in;
        this.anim_out = anim_out;
    }

    public int getAnimIn(){
        return anim_in;
    }

    public int getAnimOut(){
        return anim_out;
    }
}
