# Qualcomm® CM2290 Open Kits Text Classification-demo Developer documentation

## Introduce

The project relies on the CM2290 development kit to take advantage of the diversity and powerful computing power of the development kit. Use a TensorFlow Lite model to category a paragraph into predefined groups.

The CM2290 development board can be used for the development of AI robots. After training the mechanical energy of the model, users can develop robots with natural language dialogue


The project was built on x86 hosts using cross-compiler tools and has been implemented in Qualcomm ® CM2290 open suite

The project was built in x86 host with across complier tool and has been tested in Qualcomm® CM2290 Open Kits.

Qualcomm® CM2290 SoC Open Kits

![CM2290](./res/2290-DK-4-150x150.webp)

## Materials and Tools used for the project

1. Hardware materials

Except for the Open Kits,The following hardware materials are also needed:

* Type-C usb line

using the usb line to develop on Qualcomm® CM2290 SoC Open Kits.

![usb line](./res/usb.png )

* Charger

Direct power supply for Qualcomm® CM2290 SoC Open Kits.

![charger](./res/charger.jpg )


## Environment configuration

This section mainly describes the source and configuration of some open source projects or third-party tools needed in the development process.

### TensorFlow  -Text classification

Text classification categorizes a paragraph into predefined groups based on its content.

This pretrained model predicts if a paragraph's sentiment is positive or negative. It was trained on Large Movie Review Dataset v1.0 from Mass et al, which consists of IMDB movie reviews labeled as either positive or negative.

Here are the steps to classify a paragraph with the model:

Tokenize the paragraph and convert it to a list of word ids using a predefined vocabulary.
Feed the list to the TensorFlow Lite model.
Get the probability of the paragraph being positive or negative from the model outputs.

Note
    Only English is supported.
    This model was trained on movie reviews dataset so you may experience reduced accuracy when classifying text of other domains.


## Configure and Usage
Start the CM290 and connection CM290 to host by Type-c usb.
### 1. Configure
In the conf directory, a json configuration file is provided. This configuration file is relatively simple. It mainly configures the gstreamer camera pipeline, gstreamer udpsink push pipeline, and traditional depth estimation algorithm parameters.

### 2. Usage
The executable files in the bin directory do not require additional command line parameters. The parameters used by the program are configured by the json file, so you only need to put the configuration file in the same directory to execute the program.
