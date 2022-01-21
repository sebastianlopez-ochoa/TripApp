$(document).ready(main);

var cont = 1;

function main() {
    $('.menu').click(function () {
        //$('nav').toggle();
        if (cont == 1) {
            $('nav').animate({
                left: '0'
            });
            cont = 0;
        } else {
            $('nav').animate({
                left: '-100%'
            });
            cont = 1;
        }

    });
};