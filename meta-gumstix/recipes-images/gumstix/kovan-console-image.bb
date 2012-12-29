DESCRIPTION = "The Gumstix Caspa image with capturing utilities"

require gumstix-console-image.bb

OPENCV = " \
  opencv \
  opencv-samples \
  "

V4L_UTIL = " \
  yavta \
  media-ctl \
  "

IMAGE_INSTALL += " \
  ${OPENCV} \
  ${V4L_UTIL} \
 "
