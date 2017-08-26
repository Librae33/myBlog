;(function(window) {

  var svgSprite = '<svg>' +
    '' +
    '<symbol id="icon-617tiaowu" viewBox="0 0 1024 1024">' +
    '' +
    '<path d="M644.455731 852.758917c-21.900799-35.980469-59.44488-168.948877-68.831668-220.572628-9.385764-51.623751-7.822153-208.057593-3.128247-219.007993 4.692882-10.9504 32.851199-51.623751 0-73.52455 0 0-9.385764-18.772552 3.128247-20.336164 12.515035-1.564635 48.494481-48.494481 53.187363-82.910315 4.692882-34.415834-6.257517-95.42535 3.128247-106.375749 9.385764-10.9504 17.207917-51.623751 4.692882-62.574151-12.515035-10.9504-25.029046 20.336164-29.722952 37.544081-4.692882 17.207917 4.692882 73.52455-3.128247 114.196879-7.822153 40.673351-32.851199 62.574151-43.801599 68.831668-10.9504 6.257517-21.900799-9.385764-14.078647-42.236963 7.822153-32.851199-12.515035-56.316633-34.415834-57.881268-21.900799-1.564635-57.881268 40.673351-56.316633 84.47495 1.564635 43.801599 15.643282 54.751998-6.257517 70.39528s-71.837118 63.515592-90.608647 85.416392c-23.237237 27.110451-56.04648 27.782763-54.751998 42.236963 1.970888 22.01234 21.10262 12.212136 38.894845-5.578042 10.147104-10.146081 12.728906-10.06524 28.372188-21.015639 15.643282-10.9504 70.272483-54.129828 79.658248-54.129828s18.772552 18.772552 26.593681 29.722952c7.822153 10.9504 6.257517 59.44488-1.564635 75.088162-7.822153 15.643282-118.889761 118.889761-126.711913 154.87023-7.822153 35.979446 64.137763 26.593681 87.603197 23.465434 23.465434-3.128247 50.059116-6.257517 42.236963 17.207917-7.822153 23.465434-21.900799 101.682867-26.593681 153.305595-4.692882 51.623751 1.564635 65.702398 34.415834 71.959915 32.851199 6.257517 54.751998-10.9504 50.059116-23.465434-4.692882-12.515035-31.286564 4.692882-39.108716-23.465434-7.822153-28.158317 12.515035-120.454396 20.336164-140.791583 7.822153-20.336164 21.900799-35.980469 28.158317-3.128247 6.257517 32.851199 48.494481 112.633267 65.702398 153.305595 17.207917 40.673351 31.286564 71.959915 48.494481 79.782068 0 0 21.900799 6.257517 26.593681-23.465434C691.3866 904.382669 666.35653 888.739387 644.455731 852.758917z"  ></path>' +
    '' +
    '</symbol>' +
    '' +
    '<symbol id="icon-yinle" viewBox="0 0 1026 1024">' +
    '' +
    '<path d="M1.024 225.32608l532.48 0 0 40.957952-532.48 0 0-40.957952Z"  ></path>' +
    '' +
    '<path d="M1.024 409.63584l532.48 0 0 40.957952-532.48 0 0-40.957952Z"  ></path>' +
    '' +
    '<path d="M1.024 593.944576l532.48 0 0 40.957952-532.48 0 0-40.957952Z"  ></path>' +
    '' +
    '<path d="M738.305024 249.8048 1025.024 286.763008C1025.024 81.975296 861.185024 41.017344 697.345024 0l0 30.138368 0 214.387712 0 533.72928c-24.51968 0-63.519744 0-126.200832 0-120.379392 0-160.519168 63.695872-160.519168 121.872384 0 49.3568 36.938752 123.87328 163.84 123.87328 181.440512 0 163.84-145.672192 163.84-245.74464L738.305024 249.8048z"  ></path>' +
    '' +
    '</symbol>' +
    '' +
    '</svg>'
  var script = function() {
    var scripts = document.getElementsByTagName('script')
    return scripts[scripts.length - 1]
  }()
  var shouldInjectCss = script.getAttribute("data-injectcss")

  /**
   * document ready
   */
  var ready = function(fn) {
    if (document.addEventListener) {
      if (~["complete", "loaded", "interactive"].indexOf(document.readyState)) {
        setTimeout(fn, 0)
      } else {
        var loadFn = function() {
          document.removeEventListener("DOMContentLoaded", loadFn, false)
          fn()
        }
        document.addEventListener("DOMContentLoaded", loadFn, false)
      }
    } else if (document.attachEvent) {
      IEContentLoaded(window, fn)
    }

    function IEContentLoaded(w, fn) {
      var d = w.document,
        done = false,
        // only fire once
        init = function() {
          if (!done) {
            done = true
            fn()
          }
        }
        // polling for no errors
      var polling = function() {
        try {
          // throws errors until after ondocumentready
          d.documentElement.doScroll('left')
        } catch (e) {
          setTimeout(polling, 50)
          return
        }
        // no errors, fire

        init()
      };

      polling()
        // trying to always fire before onload
      d.onreadystatechange = function() {
        if (d.readyState == 'complete') {
          d.onreadystatechange = null
          init()
        }
      }
    }
  }

  /**
   * Insert el before target
   *
   * @param {Element} el
   * @param {Element} target
   */

  var before = function(el, target) {
    target.parentNode.insertBefore(el, target)
  }

  /**
   * Prepend el to target
   *
   * @param {Element} el
   * @param {Element} target
   */

  var prepend = function(el, target) {
    if (target.firstChild) {
      before(el, target.firstChild)
    } else {
      target.appendChild(el)
    }
  }

  function appendSvg() {
    var div, svg

    div = document.createElement('div')
    div.innerHTML = svgSprite
    svgSprite = null
    svg = div.getElementsByTagName('svg')[0]
    if (svg) {
      svg.setAttribute('aria-hidden', 'true')
      svg.style.position = 'absolute'
      svg.style.width = 0
      svg.style.height = 0
      svg.style.overflow = 'hidden'
      prepend(svg, document.body)
    }
  }

  if (shouldInjectCss && !window.__iconfont__svg__cssinject__) {
    window.__iconfont__svg__cssinject__ = true
    try {
      document.write("<style>.svgfont {display: inline-block;width: 1em;height: 1em;fill: currentColor;vertical-align: -0.1em;font-size:16px;}</style>");
    } catch (e) {
      console && console.log(e)
    }
  }

  ready(appendSvg)


})(window)